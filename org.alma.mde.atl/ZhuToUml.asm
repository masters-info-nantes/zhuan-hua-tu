<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="ZhuToUml"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchState():V"/>
		<constant value="A.__matchTransition():V"/>
		<constant value="__exec__"/>
		<constant value="State"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyState(NTransientLink;):V"/>
		<constant value="Transition"/>
		<constant value="A.__applyTransition(NTransientLink;):V"/>
		<constant value="__matchState"/>
		<constant value="IM"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="mmstate"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="umlstate"/>
		<constant value="OM"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="13:3-15:4"/>
		<constant value="__applyState"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="14:12-14:19"/>
		<constant value="14:12-14:24"/>
		<constant value="14:4-14:24"/>
		<constant value="link"/>
		<constant value="__matchTransition"/>
		<constant value="22:3-27:4"/>
		<constant value="__applyTransition"/>
		<constant value="source"/>
		<constant value="target"/>
		<constant value="triggers"/>
		<constant value="guard"/>
		<constant value="23:14-23:21"/>
		<constant value="23:14-23:28"/>
		<constant value="23:4-23:28"/>
		<constant value="24:14-24:21"/>
		<constant value="24:14-24:28"/>
		<constant value="24:4-24:28"/>
		<constant value="25:16-25:23"/>
		<constant value="25:16-25:32"/>
		<constant value="25:4-25:32"/>
		<constant value="26:13-26:20"/>
		<constant value="26:13-26:26"/>
		<constant value="26:4-26:26"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="42">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="43"/>
			<call arg="44"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="45"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="46"/>
			<call arg="44"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="47"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="0" name="17" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="48">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="43"/>
			<push arg="49"/>
			<findme/>
			<push arg="50"/>
			<call arg="51"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="52"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="43"/>
			<pcall arg="53"/>
			<dup/>
			<push arg="54"/>
			<load arg="19"/>
			<pcall arg="55"/>
			<dup/>
			<push arg="56"/>
			<push arg="43"/>
			<push arg="57"/>
			<new/>
			<pcall arg="58"/>
			<pusht/>
			<pcall arg="59"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="60" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="54" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="61">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="62"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="54"/>
			<call arg="63"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="56"/>
			<call arg="64"/>
			<store arg="65"/>
			<load arg="65"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="66" begin="11" end="11"/>
			<lne id="67" begin="11" end="12"/>
			<lne id="68" begin="9" end="14"/>
			<lne id="60" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="56" begin="7" end="15"/>
			<lve slot="2" name="54" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="69" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="70">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="46"/>
			<push arg="49"/>
			<findme/>
			<push arg="50"/>
			<call arg="51"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="52"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="46"/>
			<pcall arg="53"/>
			<dup/>
			<push arg="54"/>
			<load arg="19"/>
			<pcall arg="55"/>
			<dup/>
			<push arg="56"/>
			<push arg="46"/>
			<push arg="57"/>
			<new/>
			<pcall arg="58"/>
			<pusht/>
			<pcall arg="59"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="71" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="54" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="72">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="62"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="54"/>
			<call arg="63"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="56"/>
			<call arg="64"/>
			<store arg="65"/>
			<load arg="65"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="73"/>
			<call arg="30"/>
			<set arg="73"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="74"/>
			<call arg="30"/>
			<set arg="74"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="75"/>
			<call arg="30"/>
			<set arg="75"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="76"/>
			<call arg="30"/>
			<set arg="76"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="77" begin="11" end="11"/>
			<lne id="78" begin="11" end="12"/>
			<lne id="79" begin="9" end="14"/>
			<lne id="80" begin="17" end="17"/>
			<lne id="81" begin="17" end="18"/>
			<lne id="82" begin="15" end="20"/>
			<lne id="83" begin="23" end="23"/>
			<lne id="84" begin="23" end="24"/>
			<lne id="85" begin="21" end="26"/>
			<lne id="86" begin="29" end="29"/>
			<lne id="87" begin="29" end="30"/>
			<lne id="88" begin="27" end="32"/>
			<lne id="71" begin="8" end="33"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="56" begin="7" end="33"/>
			<lve slot="2" name="54" begin="3" end="33"/>
			<lve slot="0" name="17" begin="0" end="33"/>
			<lve slot="1" name="69" begin="0" end="33"/>
		</localvariabletable>
	</operation>
</asm>
