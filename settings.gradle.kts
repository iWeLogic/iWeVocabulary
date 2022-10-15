pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "iWeVocabulary"
include (":app")
include(":onboarding:onboarding_presentation")
include(":onboarding:onboarding_data")
include(":onboarding:onboarding_domain")
include(":main:main_domain")
include(":main:main_presentation")
include(":main:main_data")
include(":settings:settings_presentation")
include(":settings:settings_data")
include(":settings:settings_domain")
include(":login:login_data")
include(":login:login_domain")
include(":login:login_presentation")
include(":vocabulary:vocabulary_data")
include(":vocabulary:vocabulary_domain")
include(":vocabulary:vocabulary_presentation")
include(":core")
