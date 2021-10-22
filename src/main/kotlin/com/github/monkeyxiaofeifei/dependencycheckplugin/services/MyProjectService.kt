package com.github.monkeyxiaofeifei.dependencycheckplugin.services

import com.intellij.openapi.project.Project
import com.github.monkeyxiaofeifei.dependencycheckplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
