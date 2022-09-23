do_install_prepend(){
echo 'src aarch64 http://192.168.1.79:1234/aarch64' >> ${WORKDIR}/opkg.conf
echo 'src raspberrypi3_64 http://192.168.1.79:1234/raspberrypi3_64' >> ${WORKDIR}/opkg.conf
echo 'src all http://192.168.1.79:1234/all' >> ${WORKDIR}/opkg.conf
}
