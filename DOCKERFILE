FROM php:7.4-apache-bullseye
WORKDIR /var/www
COPY . .
COPY apache/000-default.conf /etc/apache2/sites-available/000-default.conf
ENV APACHE_DOCUMENT_ROOT /var/www/public
ENV APACHE_LOG_DIR /var/log/apache2
RUN sed -ri -e 's!/var/www/html!${APACHE_DOCUMENT_ROOT}!g' /etc/apache2/sites-available/*.conf
RUN sed -ri -e 's!/var/www/!${APACHE_DOCUMENT_ROOT}!g' /etc/apache2/apache2.conf /etc/apache2/conf-available/*.conf
RUN apt-get update && apt-get install -y \
		libpq-dev git unzip nano wget doxygen doxygen-doc doxygen-gui doxygen-latex \
		--no-install-recommends
COPY --from=composer:latest /usr/bin/composer /usr/local/bin/composer
RUN curl -1sLf 'https://dl.cloudsmith.io/public/symfony/stable/setup.deb.sh' | bash && apt install symfony-cli
RUN a2enmod rewrite
RUN docker-php-ext-configure pgsql -with-pgsql=/usr/local/pgsql && docker-php-ext-install pgsql pdo_pgsql
