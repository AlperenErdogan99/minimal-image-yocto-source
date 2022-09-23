SUMMARY = "Simple Qt5 Quick application"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
DEPENDS += "qtbase qtdeclarative qtquickcontrols2"
SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/shigmas/BasicQuick.git"
S = "${WORKDIR}/git"
require recipes-qt/qt5/qt5.inc

do_install() {
      install -d ${D}/opt/qt-app
      install -m 0755 BasicQuick ${D}/opt/qt-app
}

RDEPENDS_${PN} += "qtbase-qmlplugins"
RDEPENDS_${PN} += "qtdeclarative-qmlplugins"
RDEPENDS_${PN} += "qtquickcontrols2-qmlplugins"

FILES_${PN} += "/opt/qt-app"

inherit qmake5
