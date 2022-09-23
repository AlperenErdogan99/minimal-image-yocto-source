SUMMARY = "Qt Simple Calculator Application Recipe"
DESCRIPTION = "This recipe builds a Qt project for a simple calculator application."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

#DEPENDS += "qtbase qtdeclarative qtquickcontrols qtquickcontrols2"
DEPENDS += "qtbase \
            qtlocation \
            qtvirtualkeyboard \
            qtserialport \
            qtmqtt \
            qtquickcontrols2 \
            qtquicktimeline \
            qtgraphicaleffects \
            qtquickcontrols"

# qtcharts-plugins qtdeclarative-qmlplugins 
RDEPENDS_${PN} += "qtbase-qmlplugins \
                   qtlocation-qmlplugins \
                   qtvirtualkeyboard-qmlplugins \
                   qtquickcontrols2-qmlplugins \
                   qtquicktimeline-qmlplugins \
                   qtmqtt-qmlplugins \
                   qtserialport-qmlplugins \
                   qtgraphicaleffects-qmlplugins \
                   qtquickcontrols-qmlplugins"





SRC_URI = "git://github.com/vpapadopou/qt-simple-calculator;branch=master"
SRCREV = "1af09d43f9a41ad3136a4fac9db63b9542692f91"
require recipes-qt/qt5/qt5.inc

S = "${WORKDIR}/git"

do_install_append() {
    install -d ${D}/opt/qt-simple-calc/
    install -m 0755 simpleCalculator ${D}/opt/qt-simple-calc/
}

#RDEPENDS_${PN} += "qtbase-qmlplugins qtdeclarative-qmlplugins qtquickcontrols-qmlplugins qtquickcontrols2-qmlplugins"
FILES_${PN} += "/opt/qt-simple-calc/simpleCalculator"

inherit qmake5
