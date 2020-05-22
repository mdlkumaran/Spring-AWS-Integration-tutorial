package com.mdl.awsImageUpload.datastore;

import com.mdl.awsImageUpload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("20ee668a-79bc-4482-916d-3b48476b6b42"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("86d004a4-f518-4bb9-b011-65e1f97e3efc"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
