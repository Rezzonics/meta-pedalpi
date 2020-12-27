SUMMARY = "MOD LV2 data (plugins, presets and pedalboards)."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

SRCREV = "499b98e5520e970dc06bf683851d11f9c2360e05"
#SRCREV = "bc731ed68c44227530625592fb3ca7a687531771"
SRC_URI = "git://github.com/moddevices/mod-lv2-data.git"

S = "${WORKDIR}/git"

FILES_${PN} = " ${libdir}/lv2 "

inherit allarch

do_compile() {
}

do_install() {
	install -d ${D}${libdir}/lv2/Kars.lv2/
	install -d ${D}${libdir}/lv2/MVerb.lv2/
	install -d ${D}${libdir}/lv2/Nekobi.lv2/
	install -d ${D}${libdir}/lv2/PingPongPan.lv2/
	install -d ${D}${libdir}/lv2/MaBitcrush.lv2
	install -d ${D}${libdir}/lv2/3BandSplitter.lv2
	install -d ${D}${libdir}/lv2/MaGigaverb.lv2
	install -d ${D}${libdir}/lv2/SoulForce.lv2
	install -d ${D}${libdir}/lv2/MaPitchshift.lv2
	install -d ${D}${libdir}/lv2/CycleShifter.lv2
	install -d ${D}${libdir}/lv2/AmplitudeImposer.lv2
	install -d ${D}${libdir}/lv2/3BandEQ.lv2/
	install -d ${D}${libdir}/lv2/MaFreeverb.lv2
	install -d ${D}${libdir}/lv2/AVL_Drumkits_Perc.lv2/modgui
	install -d ${D}${libdir}/lv2/Black_Pearl_4A.lv2/modgui
	install -d ${D}${libdir}/lv2/Black_Pearl_4B.lv2/modgui
	install -d ${D}${libdir}/lv2/Black_Pearl_5.lv2/modgui
	install -d ${D}${libdir}/lv2/Red_Zeppelin_4.lv2/modgui
	install -d ${D}${libdir}/lv2/Red_Zeppelin_5.lv2/modgui
	install -d ${D}${libdir}/lv2/rkr.lv2
	cp ${S}/plugins-fixed/Kars.lv2/manifest.ttl ${S}/plugins-fixed/Kars.lv2/Kars_dsp.ttl ${S}/plugins-fixed/Kars.lv2/default-preset.ttl ${D}/${libdir}/lv2/Kars.lv2
	cp ${S}/plugins-fixed/MVerb.lv2/manifest.ttl ${S}/plugins-fixed/MVerb.lv2/MVerb_dsp.ttl ${S}/plugins-fixed/MVerb.lv2/default-preset.ttl ${S}/plugins-fixed/MVerb.lv2/presets.ttl ${D}/${libdir}/lv2/MVerb.lv2
	cp ${S}/plugins-fixed/Nekobi.lv2/manifest.ttl ${S}/plugins-fixed/Nekobi.lv2/Nekobi_dsp.ttl ${S}/plugins-fixed/Nekobi.lv2/default-preset.ttl ${D}/${libdir}/lv2/Nekobi.lv2
	cp ${S}/plugins-fixed/PingPongPan.lv2/manifest.ttl ${S}/plugins-fixed/PingPongPan.lv2/PingPongPan_dsp.ttl ${S}/plugins-fixed/PingPongPan.lv2/default-preset.ttl  ${S}/plugins-fixed/PingPongPan.lv2/presets.ttl ${D}/${libdir}/lv2/PingPongPan.lv2
        cp ${S}/plugins/MaBitcrush.lv2/manifest.ttl ${S}/plugins/MaBitcrush.lv2/MaBitcrush_dsp.ttl ${S}/plugins/MaBitcrush.lv2/default-preset.ttl ${D}/${libdir}/lv2/MaBitcrush.lv2
        cp ${S}/plugins/3BandSplitter.lv2/manifest.ttl ${S}/plugins/3BandSplitter.lv2/3BandSplitter_dsp.ttl ${S}/plugins/3BandSplitter.lv2/default-preset.ttl ${S}/plugins/3BandSplitter.lv2/presets.ttl ${D}/${libdir}/lv2/3BandSplitter.lv2
        cp ${S}/plugins/MaGigaverb.lv2/manifest.ttl ${S}/plugins/MaGigaverb.lv2/MaGigaverb_dsp.ttl ${S}/plugins/MaGigaverb.lv2/default-preset.ttl ${D}/${libdir}/lv2/MaGigaverb.lv2
        cp ${S}/plugins/SoulForce.lv2/manifest.ttl ${S}/plugins/SoulForce.lv2/SoulForce_dsp.ttl ${S}/plugins/SoulForce.lv2/default-preset.ttl ${S}/plugins/SoulForce.lv2/presets.ttl ${D}/${libdir}/lv2/SoulForce.lv2
        cp ${S}/plugins/MaPitchshift.lv2/manifest.ttl ${S}/plugins/MaPitchshift.lv2/MaPitchshift_dsp.ttl ${S}/plugins/MaPitchshift.lv2/default-preset.ttl ${D}/${libdir}/lv2/MaPitchshift.lv2
        cp ${S}/plugins/CycleShifter.lv2/manifest.ttl ${S}/plugins/CycleShifter.lv2/CycleShifter_dsp.ttl ${S}/plugins/CycleShifter.lv2/default-preset.ttl ${S}/plugins/CycleShifter.lv2/presets.ttl ${D}/${libdir}/lv2/CycleShifter.lv2
        cp ${S}/plugins/AmplitudeImposer.lv2/manifest.ttl ${S}/plugins/AmplitudeImposer.lv2/AmplitudeImposer_dsp.ttl ${S}/plugins/AmplitudeImposer.lv2/default-preset.ttl ${S}/plugins/AmplitudeImposer.lv2/presets.ttl ${D}/${libdir}/lv2/AmplitudeImposer.lv2
        cp ${S}/plugins/3BandEQ.lv2/manifest.ttl ${S}/plugins/3BandEQ.lv2/3BandEQ_dsp.ttl ${S}/plugins/3BandEQ.lv2/default-preset.ttl ${S}/plugins/3BandEQ.lv2/presets.ttl ${D}/${libdir}/lv2/3BandEQ.lv2
        cp ${S}/plugins/MaFreeverb.lv2/manifest.ttl ${S}/plugins/MaFreeverb.lv2/MaFreeverb_dsp.ttl ${S}/plugins/MaFreeverb.lv2/default-preset.ttl ${D}/${libdir}/lv2/MaFreeverb.lv2
#	cp ${S}/plugins-fixed/Red_Zeppelin_5.lv2/manifest.ttl ${S}/plugins-fixed/Red_Zeppelin_5.lv2/FluidPlug.ttl ${S}/plugins-fixed/Red_Zeppelin_5.lv2/default-preset.ttl ${D}/${libdir}/lv2/Red_Zeppelin_5.lv2
#	cp -R ${S}/plugins-fixed/Red_Zeppelin_5.lv2/modgui ${S}/plugins-fixed/Red_Zeppelin_5.lv2/modgui.ttl ${D}/${libdir}/lv2/Red_Zeppelin_5.lv2/
#	cp -R ${S}/plugins-fixed/rkr.lv2/modgui ${S}/plugins-fixed/rkr.lv2/modguis.ttl ${S}/plugins-fixed/rkr.lv2/manifest.ttl ${D}/${libdir}/lv2/rkr.lv2/
 	cp -R ${S}/plugins-fixed/AVL_Drumkits_Perc.lv2/modgui   ${D}/${libdir}/lv2/AVL_Drumkits_Perc.lv2/
 	cp -R ${S}/plugins-fixed/Black_Pearl_4A.lv2/modgui      ${D}/${libdir}/lv2/Black_Pearl_4A.lv2/
 	cp -R ${S}/plugins-fixed/Black_Pearl_4B.lv2/modgui      ${D}/${libdir}/lv2/Black_Pearl_4B.lv2/
 	cp -R ${S}/plugins-fixed/Black_Pearl_5.lv2/modgui       ${D}/${libdir}/lv2/Black_Pearl_5.lv2/
 	cp -R ${S}/plugins-fixed/Red_Zeppelin_4.lv2/modgui      ${D}/${libdir}/lv2/Red_Zeppelin_4.lv2/
 	cp -R ${S}/plugins-fixed/Red_Zeppelin_5.lv2/modgui      ${D}/${libdir}/lv2/Red_Zeppelin_5.lv2/

	install -d ${D}${libdir}/lv2/Larynx.lv2
	install -d ${D}${libdir}/lv2/Modulay.lv2
	install -d ${D}${libdir}/lv2/Pitchotto.lv2
	install -d ${D}${libdir}/lv2/Harmless.lv2
	install -d ${D}${libdir}/lv2/Shiroverb.lv2
	cp -R ${S}/plugins-fixed/Larynx.lv2/modgui ${S}/plugins-fixed/Larynx.lv2/modgui.ttl ${D}/${libdir}/lv2/Larynx.lv2/
	cp -R ${S}/plugins-fixed/Shiroverb.lv2/modgui ${S}/plugins-fixed/Shiroverb.lv2/modgui.ttl ${D}/${libdir}/lv2/Shiroverb.lv2/
	cp -R ${S}/plugins-fixed/Harmless.lv2/modgui ${S}/plugins-fixed/Harmless.lv2/modgui.ttl ${D}/${libdir}/lv2/Harmless.lv2/
	cp -R ${S}/plugins-fixed/Modulay.lv2/modgui ${S}/plugins-fixed/Modulay.lv2/modgui.ttl ${D}/${libdir}/lv2/Modulay.lv2/

	cp -R ${S}/plugins-fixed/Pitchotto.lv2/modgui ${S}/plugins-fixed/Pitchotto.lv2/modgui.ttl ${D}/${libdir}/lv2/Pitchotto.lv2/

	install -d ${D}${libdir}/lv2/calf.lv2/modgui/
	cp ${S}/plugins-fixed/calf.lv2/modguis.ttl  ${S}/plugins-fixed/calf.lv2/manifest.ttl ${D}/${libdir}/lv2/calf.lv2
	cp -R ${S}/plugins-fixed/calf.lv2/modgui   ${D}/${libdir}/lv2/calf.lv2/
	
	install -d ${D}${libdir}/lv2/eg-metro.lv2/modgui/
	cp ${S}/plugins-fixed/eg-metro.lv2/modgui.ttl ${S}/plugins-fixed/eg-metro.lv2/manifest.ttl ${D}/${libdir}/lv2/eg-metro.lv2
	cp -R ${S}/plugins-fixed/eg-metro.lv2/modgui   ${D}/${libdir}/lv2/eg-metro.lv2/
	
	install -d ${D}${libdir}/lv2/gx_gcb_95.lv2/modgui/
	cp ${S}/plugins-fixed/gx_gcb_95.lv2/modgui.ttl ${S}/plugins-fixed/gx_gcb_95.lv2/manifest.ttl ${D}/${libdir}/lv2/gx_gcb_95.lv2
	cp -R ${S}/plugins-fixed/gx_gcb_95.lv2/modgui ${D}/${libdir}/lv2/gx_gcb_95.lv2/

	install -d ${D}${libdir}/lv2/gx_mole.lv2/modgui/
	cp ${S}/plugins-fixed/gx_mole.lv2/modgui.ttl ${S}/plugins-fixed/gx_mole.lv2/manifest.ttl   ${D}/${libdir}/lv2/gx_mole.lv2
	cp -R ${S}/plugins-fixed/gx_mole.lv2/modgui   ${D}/${libdir}/lv2/gx_mole.lv2/

	install -d ${D}${libdir}/lv2/gx_muff.lv2/modgui/
	cp ${S}/plugins-fixed/gx_muff.lv2/modgui.ttl ${S}/plugins-fixed/gx_muff.lv2/manifest.ttl  ${D}/${libdir}/lv2/gx_muff.lv2
	cp -R ${S}/plugins-fixed/gx_muff.lv2/modgui   ${D}/${libdir}/lv2/gx_muff.lv2/

	install -d ${D}${libdir}/lv2/Freakclip.lv2/
	cp ${S}/plugins-fixed/Freakclip.lv2/default-preset.ttl ${S}/plugins-fixed/Freakclip.lv2/manifest.ttl  ${D}/${libdir}/lv2/Freakclip.lv2/
}
