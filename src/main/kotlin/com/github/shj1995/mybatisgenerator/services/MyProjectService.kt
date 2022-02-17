package com.github.shj1995.mybatisgenerator.services

import com.intellij.openapi.project.Project
import com.github.shj1995.mybatisgenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
