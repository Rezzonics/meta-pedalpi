DESCRIPTION = "Control Chain protocol Master"
SECTION="multimedia"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/moddevices/cc-master;protocol=http"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "b3fdbac42f30e3b3b9dcede1016ca768b4d71b11"

DEPENDS = " jansson libserialport "

S = "${WORKDIR}/git"
PACKAGES = "${PN} ${PN}-dev ${PN}-dbg ${PN}-staticdev"
RDEPENDS_${PN}-dev = ""
RDEPENDS_${PN}-dbg = ""
RDEPENDS_${PN}-staticdev = ""

inherit waf pkgconfig

WAF_PYTHON = "python3"

EXTRA_OECONF = " --prefix=/usr "

FILES_${PN} += " ${libdir}/* ${incdir}/* ${bindir}/controlchaind"

