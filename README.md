# email-template-builder




Let this service build your html/text emails in a fluent manner. It doesn't try to reinvent the wheel - it simply extends the given [email-template](https://postmarkapp.com/mailmason) of postmark and backed it for java to use it for many purposes.

You can write your email content fluently and the template builder cares for the correct instyling, conversation to txt version etc...

For sending the email I can recommend the spring-boot-starter-mail, simplejavamail or my [postmark-spring](https://github.com/rocketbase-io/postmark-spring)...

### release notes
- 1.x bases mailgun templates
  - extra dependency on jsoup for auto inlining/transpiling to text
  - doc for old api could be found in wiki

- 2.x bases on new postmark templates
  - pom artifact group changed to **io.rocketbase.mail**
  - removed jsoup from dependency and changed api in many cases
  - cleaned up a lot of code
  - separated module in two pices
    - common builder
    - markdown (with markdown support)

## features

- generate html and text mail via one fluent build
- just pebble-template engine as dependency
- support for the following content-types
  - Logo in the header
  - Text also with HTML support and Alignment configuration
  - Image with Alignment configuration and Link options
  - Button with custom Styling
  - Footer with HTML support and Alignment configuration
  - Copyright with dynamic Year and Link options
  - table with header, item/price, total
  - key value pairs
  - interface for tables to provide custom layouts
  - extra module to transpile markdown



  
