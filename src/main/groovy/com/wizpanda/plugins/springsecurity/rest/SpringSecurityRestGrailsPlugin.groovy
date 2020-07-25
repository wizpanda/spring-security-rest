package com.wizpanda.plugins.springsecurity.rest

import grails.plugins.Plugin

class SpringSecurityRestGrailsPlugin extends Plugin {

    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "4.0.4 > *"

    List loadAfter = ['springSecurityCore']

    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def title = "Spring Security Rest"
    def author = "Shashank Agrawal"
    def authorEmail = "creative@wizpanda.com"
    def description = "Grails plugin to implement token-based, RESTful authentication using Spring Security"

    def issueManagement = [system: "GitHub", url: "https://github.com/wizpanda/spring-security-rest/issues"]

    def scm = [url: "https://github.com/wizpanda/spring-security-rest"]
}
