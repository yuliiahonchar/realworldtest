package org.realworld.api.datamodel.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateUser {

    @JsonProperty
    private String email;
    @JsonProperty
    private String token;
    @JsonProperty
    private String username;
    @JsonProperty
    private String bio;
    @JsonProperty
    private String image;

    public String getToken() {
        return token;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getImage() {
        return image;
    }

    public String getBio() {
        return bio;
    }

    public static class Builder {

        private final UpdateUser user = new UpdateUser();

        public Builder email(String email) {
            this.user.email = email;
            return this;
        }

        public Builder token(String token) {
            this.user.token = token;
            return this;
        }

        public Builder username(String username) {
            this.user.username = username;
            return this;
        }

        public Builder bio(String bio) {
            this.user.bio = bio;
            return this;
        }

        public Builder image(String image) {
            this.user.image = image;
            return this;
        }

        public UpdateUser build(){
            return user;
        }
    }
}
