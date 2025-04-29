.class final Lp5/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lv5/a;

.field private static final b:Lo5/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo5/j<",
            "Lp5/c;",
            "Lo5/m;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Lo5/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo5/i<",
            "Lo5/m;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Lo5/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo5/c<",
            "Lp5/a;",
            "Lo5/l;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Lo5/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo5/b<",
            "Lo5/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-class v0, Lo5/l;

    const-class v1, Lo5/m;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-static {v2}, Lo5/q;->d(Ljava/lang/String;)Lv5/a;

    move-result-object v2

    sput-object v2, Lp5/h;->a:Lv5/a;

    sget-object v3, Lp5/g;->a:Lp5/g;

    const-class v4, Lp5/c;

    invoke-static {v3, v4, v1}, Lo5/j;->a(Lo5/j$b;Ljava/lang/Class;Ljava/lang/Class;)Lo5/j;

    move-result-object v3

    sput-object v3, Lp5/h;->b:Lo5/j;

    sget-object v3, Lp5/f;->a:Lp5/f;

    invoke-static {v3, v2, v1}, Lo5/i;->a(Lo5/i$b;Lv5/a;Ljava/lang/Class;)Lo5/i;

    move-result-object v1

    sput-object v1, Lp5/h;->c:Lo5/i;

    sget-object v1, Lp5/e;->a:Lp5/e;

    const-class v3, Lp5/a;

    invoke-static {v1, v3, v0}, Lo5/c;->a(Lo5/c$b;Ljava/lang/Class;Ljava/lang/Class;)Lo5/c;

    move-result-object v1

    sput-object v1, Lp5/h;->d:Lo5/c;

    sget-object v1, Lp5/d;->a:Lp5/d;

    invoke-static {v1, v2, v0}, Lo5/b;->a(Lo5/b$b;Lv5/a;Ljava/lang/Class;)Lo5/b;

    move-result-object v0

    sput-object v0, Lp5/h;->e:Lo5/b;

    return-void
.end method

.method public static synthetic a(Lo5/l;Lg5/x;)Lp5/a;
    .locals 0

    invoke-static {p0, p1}, Lp5/h;->b(Lo5/l;Lg5/x;)Lp5/a;

    move-result-object p0

    return-object p0
.end method

.method private static b(Lo5/l;Lg5/x;)Lp5/a;
    .locals 3

    invoke-virtual {p0}, Lo5/l;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lo5/l;->g()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v1

    invoke-static {v0, v1}, Lt5/a;->V(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/a;

    move-result-object v0

    invoke-virtual {v0}, Lt5/a;->T()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lt5/a;->S()Lt5/c;

    move-result-object v1

    invoke-virtual {p0}, Lo5/l;->e()Lt5/i0;

    move-result-object v2

    invoke-static {v1, v2}, Lp5/h;->c(Lt5/c;Lt5/i0;)Lp5/c;

    move-result-object v1

    invoke-virtual {v0}, Lt5/a;->R()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->A()[B

    move-result-object v0

    invoke-static {p1}, Lg5/x;->b(Lg5/x;)Lg5/x;

    move-result-object p1

    invoke-static {v0, p1}, Lv5/b;->a([BLg5/x;)Lv5/b;

    move-result-object p1

    invoke-virtual {p0}, Lo5/l;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-static {v1, p1, p0}, Lp5/a;->d(Lp5/c;Lv5/b;Ljava/lang/Integer;)Lp5/a;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Only version 0 keys are accepted"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/c0; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Parsing AesCmacKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Wrong type URL in call to AesCmacParameters.parseParameters"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static c(Lt5/c;Lt5/i0;)Lp5/c;
    .locals 0

    invoke-virtual {p0}, Lt5/c;->Q()I

    move-result p0

    invoke-static {p1}, Lp5/h;->f(Lt5/i0;)Lp5/c$a;

    move-result-object p1

    invoke-static {p0, p1}, Lp5/c;->a(ILp5/c$a;)Lp5/c;

    move-result-object p0

    return-object p0
.end method

.method public static d()V
    .locals 1

    invoke-static {}, Lo5/h;->a()Lo5/h;

    move-result-object v0

    invoke-static {v0}, Lp5/h;->e(Lo5/h;)V

    return-void
.end method

.method public static e(Lo5/h;)V
    .locals 1

    sget-object v0, Lp5/h;->b:Lo5/j;

    invoke-virtual {p0, v0}, Lo5/h;->g(Lo5/j;)V

    sget-object v0, Lp5/h;->c:Lo5/i;

    invoke-virtual {p0, v0}, Lo5/h;->f(Lo5/i;)V

    sget-object v0, Lp5/h;->d:Lo5/c;

    invoke-virtual {p0, v0}, Lo5/h;->e(Lo5/c;)V

    sget-object v0, Lp5/h;->e:Lo5/b;

    invoke-virtual {p0, v0}, Lo5/h;->d(Lo5/b;)V

    return-void
.end method

.method private static f(Lt5/i0;)Lp5/c$a;
    .locals 3

    sget-object v0, Lp5/h$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object p0, Lp5/c$a;->e:Lp5/c$a;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to parse OutputPrefixType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lt5/i0;->a()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lp5/c$a;->d:Lp5/c$a;

    return-object p0

    :cond_2
    sget-object p0, Lp5/c$a;->c:Lp5/c$a;

    return-object p0

    :cond_3
    sget-object p0, Lp5/c$a;->b:Lp5/c$a;

    return-object p0
.end method
