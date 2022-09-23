PACKAGECONFIG_append = " sql-sqlite accessibility eglfs fontconfig gles2 linuxfb tslib"
#PACKAGECONFIG_append = " eglfs gles2"
#PACKAGECONFIG_append = " sql-sqlite accessibility eglfs fontconfig gles2 tslib"

#PACKAGECONFIG_remove = " minimal minimaleg1 offscreen vnc xcb"
PACKAGECONFIG_remove = " examples tests"
DEPENDS += "userland"
