# DISCLAIMER

This is an example of an integration between Spring Boot and Cognito.

### This is **NOT** official AWS code.
### This is **NOT** supported code.
### This is **NOT** vetted code.
#### (This is **NOT** clean code.)
### This code **SHOULD NOT be used in ANY production system**.

Any usage of this code is under full and sole responsibility of the end user. 


# What does this code do?

It will show the user:

- Integration with Cognito
- Use the resulting ID token to retrieve an STS token
- Use the STS token to call S3 and Athena

# How to configure?

Refer to the `src/main/resources/application.yml` file, all required attributes are marked and self-explanatory.

The `IndexController` contains a query on Athena - that query is reused from the example in the documentation: https://docs.aws.amazon.com/athena/latest/ug/getting-started.html .

# Other requirements

- You need to set up a Cognito User Pool (https://docs.aws.amazon.com/cognito/latest/developerguide/tutorial-create-user-pool.html) and a Cognito Identity Pool (https://docs.aws.amazon.com/cognito/latest/developerguide/tutorial-create-identity-pool.html).

## Adding additional identity providers

This same code will work if you integrate other identity providers with Cognito. All the interaction with other identity providers will be solely on Cognito's side, so the application does not need to be updated. Documentation: https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create.html .

# CDK

It also contains very basic CDK code to quickly deploy this on an ECS Fargate cluster. This can be found in the `/cdk` folder. The included Dockerfile is fully self-contained, so running a `cdk deploy` will act as a deployment pipeline.




