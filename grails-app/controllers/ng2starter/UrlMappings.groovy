package ng2starter

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(redirect: "/app")
        "/app/**"(controller: "app")
    }
}
