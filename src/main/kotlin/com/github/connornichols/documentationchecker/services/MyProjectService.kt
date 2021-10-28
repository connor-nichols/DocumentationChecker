package com.github.connornichols.documentationchecker.services

import com.intellij.openapi.project.Project
import com.github.connornichols.documentationchecker.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
