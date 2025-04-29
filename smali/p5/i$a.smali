.class Lp5/i$a;
.super Lo5/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp5/i;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/k<",
        "Lg5/s;",
        "Lt5/v;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1}, Lo5/k;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/s0;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lt5/v;

    invoke-virtual {p0, p1}, Lp5/i$a;->c(Lt5/v;)Lg5/s;

    move-result-object p1

    return-object p1
.end method

.method public c(Lt5/v;)Lg5/s;
    .locals 4

    invoke-virtual {p1}, Lt5/v;->T()Lt5/x;

    move-result-object v0

    invoke-virtual {v0}, Lt5/x;->R()Lt5/u;

    move-result-object v0

    invoke-virtual {p1}, Lt5/v;->S()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->A()[B

    move-result-object v1

    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    const-string v3, "HMAC"

    invoke-direct {v2, v1, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {p1}, Lt5/v;->T()Lt5/x;

    move-result-object p1

    invoke-virtual {p1}, Lt5/x;->S()I

    move-result p1

    sget-object v1, Lp5/i$c;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    new-instance v0, Lu5/o;

    new-instance v1, Lu5/n;

    const-string v3, "HMACSHA512"

    invoke-direct {v1, v3, v2}, Lu5/n;-><init>(Ljava/lang/String;Ljava/security/Key;)V

    invoke-direct {v0, v1, p1}, Lu5/o;-><init>(Ls5/a;I)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown hash"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance v0, Lu5/o;

    new-instance v1, Lu5/n;

    const-string v3, "HMACSHA384"

    invoke-direct {v1, v3, v2}, Lu5/n;-><init>(Ljava/lang/String;Ljava/security/Key;)V

    invoke-direct {v0, v1, p1}, Lu5/o;-><init>(Ls5/a;I)V

    return-object v0

    :cond_2
    new-instance v0, Lu5/o;

    new-instance v1, Lu5/n;

    const-string v3, "HMACSHA256"

    invoke-direct {v1, v3, v2}, Lu5/n;-><init>(Ljava/lang/String;Ljava/security/Key;)V

    invoke-direct {v0, v1, p1}, Lu5/o;-><init>(Ls5/a;I)V

    return-object v0

    :cond_3
    new-instance v0, Lu5/o;

    new-instance v1, Lu5/n;

    const-string v3, "HMACSHA224"

    invoke-direct {v1, v3, v2}, Lu5/n;-><init>(Ljava/lang/String;Ljava/security/Key;)V

    invoke-direct {v0, v1, p1}, Lu5/o;-><init>(Ls5/a;I)V

    return-object v0

    :cond_4
    new-instance v0, Lu5/o;

    new-instance v1, Lu5/n;

    const-string v3, "HMACSHA1"

    invoke-direct {v1, v3, v2}, Lu5/n;-><init>(Ljava/lang/String;Ljava/security/Key;)V

    invoke-direct {v0, v1, p1}, Lu5/o;-><init>(Ls5/a;I)V

    return-object v0
.end method
