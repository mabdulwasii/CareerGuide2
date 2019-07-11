package careerguide

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
/*
        "/exams"(resources:"exam")
        "/events"(resources:"event")
        "/event/eventRequest"(resources:"eventRequest")

        "/institution/department"(resources:"department")*/

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
