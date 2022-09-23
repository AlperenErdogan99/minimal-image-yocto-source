do_install_prepend(){

 echo 'ctrl_interface=/var/run/wpa_supplicant
ctrl_interface_group=0
update_config=1

network={
        ssid="Zyxel_B351_5G"
        psk="4K8LMXPJMG"
        proto=RSN
        key_mgmt=WPA-PSK
}' > ${WORKDIR}/wpa_supplicant.conf-sane

}
