.class public final Lp5/a;
.super Lp5/k;
.source "SourceFile"


# instance fields
.field private final a:Lp5/c;

.field private final b:Lv5/b;

.field private final c:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Lp5/c;Lv5/b;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Lp5/k;-><init>()V

    iput-object p1, p0, Lp5/a;->a:Lp5/c;

    iput-object p2, p0, Lp5/a;->b:Lv5/b;

    iput-object p3, p0, Lp5/a;->c:Ljava/lang/Integer;

    return-void
.end method

.method public static d(Lp5/c;Lv5/b;Ljava/lang/Integer;)Lp5/a;
    .locals 2

    invoke-virtual {p1}, Lv5/b;->b()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_4

    invoke-virtual {p0}, Lp5/c;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Cannot create key without ID requirement with format with ID requirement"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lp5/c;->e()Z

    move-result v0

    if-nez v0, :cond_3

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Cannot create key with ID requirement with format without ID requirement"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    new-instance v0, Lp5/a;

    invoke-direct {v0, p0, p1, p2}, Lp5/a;-><init>(Lp5/c;Lv5/b;Ljava/lang/Integer;)V

    return-object v0

    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Invalid key size"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public bridge synthetic a()Lg5/t;
    .locals 1

    invoke-virtual {p0}, Lp5/a;->e()Lp5/c;

    move-result-object v0

    return-object v0
.end method

.method public b()Lv5/a;
    .locals 4

    iget-object v0, p0, Lp5/a;->a:Lp5/c;

    invoke-virtual {v0}, Lp5/c;->d()Lp5/c$a;

    move-result-object v0

    sget-object v1, Lp5/c$a;->e:Lp5/c$a;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    new-array v0, v2, [B

    invoke-static {v0}, Lv5/a;->a([B)Lv5/a;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lp5/a;->a:Lp5/c;

    invoke-virtual {v0}, Lp5/c;->d()Lp5/c$a;

    move-result-object v0

    sget-object v1, Lp5/c$a;->d:Lp5/c$a;

    const/4 v3, 0x5

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lp5/a;->a:Lp5/c;

    invoke-virtual {v0}, Lp5/c;->d()Lp5/c$a;

    move-result-object v0

    sget-object v1, Lp5/c$a;->c:Lp5/c$a;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lp5/a;->a:Lp5/c;

    invoke-virtual {v0}, Lp5/c;->d()Lp5/c$a;

    move-result-object v0

    sget-object v1, Lp5/c$a;->b:Lp5/c$a;

    if-ne v0, v1, :cond_2

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lp5/a;->c:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lv5/a;->a([B)Lv5/a;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown AesCmacParameters.Variant: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lp5/a;->a:Lp5/c;

    invoke-virtual {v2}, Lp5/c;->d()Lp5/c$a;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lp5/a;->c:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lv5/a;->a([B)Lv5/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lp5/l;
    .locals 1

    invoke-virtual {p0}, Lp5/a;->e()Lp5/c;

    move-result-object v0

    return-object v0
.end method

.method public e()Lp5/c;
    .locals 1

    iget-object v0, p0, Lp5/a;->a:Lp5/c;

    return-object v0
.end method
