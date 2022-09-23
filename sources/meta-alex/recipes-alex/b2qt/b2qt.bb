DESCRIPTON = "Qt simple calculator startup script recipe"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"


SRC_URI = "file://b2qt-init-script \
           file://b2qt"


do_install() {

    install -d ${D}${sysconfdir}/init.d
    install -d ${D}${sysconfdir}/rc0.d
    install -d ${D}${sysconfdir}/rc1.d
    install -d ${D}${sysconfdir}/rc2.d
    install -d ${D}${sysconfdir}/rc3.d
    install -d ${D}${sysconfdir}/rc4.d
    install -d ${D}${sysconfdir}/rc5.d
    install -d ${D}${sysconfdir}/rc6.d

    install -d ${D}${sbindir}
    install -d ${D}/usr/bin

    install -m 0755 ${WORKDIR}/b2qt-init-script  ${D}${sysconfdir}/init.d/
    install -m 0755 ${WORKDIR}/b2qt      ${D}/usr/bin
    ln -sf ../init.d/b2qt-init-script      ${D}${sysconfdir}/rc0.d/K90b2qt-init-script
    ln -sf ../init.d/b2qt-init-script      ${D}${sysconfdir}/rc1.d/K90b2qt-init-script
    ln -sf ../init.d/b2qt-init-script      ${D}${sysconfdir}/rc2.d/S90b2qt-init-script
    ln -sf ../init.d/b2qt-init-script      ${D}${sysconfdir}/rc3.d/S90b2qt-init-script
    ln -sf ../init.d/b2qt-init-script      ${D}${sysconfdir}/rc4.d/S90b2qt-init-script
    ln -sf ../init.d/b2qt-init-script      ${D}${sysconfdir}/rc5.d/S90b2qt-init-script
    ln -sf ../init.d/b2qt-init-script      ${D}${sysconfdir}/rc6.d/K90b2qt-init-script

}

FILES_${PN} += "/usr/bin"
FILES_${PN} += "/usr/sbin"
