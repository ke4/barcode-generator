package uk.ac.sanger.scgcf.barcodegenerator.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(
    value = "class uk.ac.sanger.scgcf.barcodegenerator.codegen.languages.SpringCodegen",
    date = "2016-11-25T08:23:20.639Z"
)

/**
 * Base documentation configuration class for the
 * <code>BarcodeGenerator</code> service.
 * 
 * @author ke4
 *
 */
@Configuration
public class SwaggerDocumentationConfig {
    
    ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("BarcodeGenerator Service")
                .description(
                        "Usage: To read the already generated barcode types: "
                        + "send a **GET** request against the `/barcodes` endpoint.<br />"
                        + "To create a single barcode: send a **POST** request against the `/barcodes` endpoint.<br />"
                        + "To create a batch of barcodes: send a **POST** request against the `/batch_barcodes` endpoint."
                        )
                .license("Apache 2.0").licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .termsOfServiceUrl("").version("0.0.1").contact(new Contact("", "", "")).build();
    }
    
    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("uk.ac.sanger.scgcf.barcodegenerator.controller")).build()
                .directModelSubstitute(org.joda.time.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.joda.time.DateTime.class, java.util.Date.class)
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false);
    }
    
}
