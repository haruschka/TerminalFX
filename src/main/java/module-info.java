open module com.kodedu.terminalfx {

    requires transitive javafx.graphics;
    requires javafx.fxml;
    requires transitive javafx.web;
    requires transitive jdk.jsobject;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.annotation;
    requires transitive pty4j;
    requires org.apache.commons.lang3;
    requires org.apache.commons.io;

    exports com.kodedu.terminalfx;
    exports com.kodedu.terminalfx.config;
    exports com.kodedu.terminalfx.helper;

}