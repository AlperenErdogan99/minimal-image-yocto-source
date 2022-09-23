do_install_prepend(){
echo 'QT_QPA_PLATFORM="eglfs"' >> ${WORKDIR}/profile
echo 'QT_QPA_EGLFS_INTEGRATION="eglfs_kms"' >> ${WORKDIR}/profile
echo 'XDG_RUNTIME_DIR="/var/volatile/runtime-root"' >> ${WORKDIR}/profile
echo 'export QT_QPA_PLATFORM QT_QPA_EGLFS_INTEGRATION XDG_RUNTIME_DIR' >> ${WORKDIR}/profile
}
