package com.github.nathanewhite.locoplugin.services

import com.intellij.openapi.project.Project
import com.github.nathanewhite.locoplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
