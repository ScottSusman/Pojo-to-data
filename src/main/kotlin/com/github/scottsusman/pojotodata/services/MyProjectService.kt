package com.github.scottsusman.pojotodata.services

import com.intellij.openapi.project.Project
import com.github.scottsusman.pojotodata.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
