package eu.getmangos.rest;

import javax.ws.rs.ApplicationPath;

import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@ApplicationPath("/aiplayerbot")
@OpenAPIDefinition(
    tags = {
        @Tag(name = "aiplayerbot", description="Operations about AI Players Bot")
    },
    externalDocs = @ExternalDocumentation(
        description = "Instructions on how to deploy this WebApp",
        url = "https://github.com/Warkdev/aiplayerbot-service/blob/master/README.md"
    ),
    info = @Info(
            title = "Mangos AI Player Bots API",
            version = "1.0",
            description = "API allowing to interact with Mangos AI Player Bots",
            license = @License(
                    name = "Apache 2.0"
            )
    )
)
public class OpenAPIConfig {
}
