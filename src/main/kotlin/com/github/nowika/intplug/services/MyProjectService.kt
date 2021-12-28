package com.github.nowika.intplug.services

import com.intellij.openapi.project.Project
import com.github.nowika.intplug.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
