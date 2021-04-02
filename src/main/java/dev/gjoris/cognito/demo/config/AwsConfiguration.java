package dev.gjoris.cognito.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AnonymousCredentialsProvider;
import software.amazon.awssdk.services.cognitoidentity.CognitoIdentityClient;
import software.amazon.awssdk.services.s3.S3Client;

@Configuration
public class AwsConfiguration {

    @Bean
    public CognitoIdentityClient cognitoIdentityClient() {
        return CognitoIdentityClient
                .builder()
                .credentialsProvider(
                        AnonymousCredentialsProvider.create()
                )
                .build();
    }

}
