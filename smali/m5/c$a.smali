.class Lm5/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Lg5/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/u<",
            "Lg5/d;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lr5/b$a;

.field private final c:Lr5/b$a;


# direct methods
.method public constructor <init>(Lg5/u;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/u<",
            "Lg5/d;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm5/c$a;->a:Lg5/u;

    invoke-virtual {p1}, Lg5/u;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo5/g;->b()Lo5/g;

    move-result-object v0

    invoke-virtual {v0}, Lo5/g;->a()Lr5/b;

    move-result-object v0

    invoke-static {p1}, Lo5/f;->a(Lg5/u;)Lr5/c;

    move-result-object p1

    const-string v1, "daead"

    const-string v2, "encrypt"

    invoke-interface {v0, p1, v1, v2}, Lr5/b;->a(Lr5/c;Ljava/lang/String;Ljava/lang/String;)Lr5/b$a;

    move-result-object v2

    iput-object v2, p0, Lm5/c$a;->b:Lr5/b$a;

    const-string v2, "decrypt"

    invoke-interface {v0, p1, v1, v2}, Lr5/b;->a(Lr5/c;Ljava/lang/String;Ljava/lang/String;)Lr5/b$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lo5/f;->a:Lr5/b$a;

    iput-object p1, p0, Lm5/c$a;->b:Lr5/b$a;

    :goto_0
    iput-object p1, p0, Lm5/c$a;->c:Lr5/b$a;

    return-void
.end method


# virtual methods
.method public a([B[B)[B
    .locals 4

    const/4 v0, 0x2

    :try_start_0
    new-array v0, v0, [[B

    const/4 v1, 0x0

    iget-object v2, p0, Lm5/c$a;->a:Lg5/u;

    invoke-virtual {v2}, Lg5/u;->e()Lg5/u$c;

    move-result-object v2

    invoke-virtual {v2}, Lg5/u$c;->a()[B

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lm5/c$a;->a:Lg5/u;

    invoke-virtual {v2}, Lg5/u;->e()Lg5/u$c;

    move-result-object v2

    invoke-virtual {v2}, Lg5/u$c;->f()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg5/d;

    invoke-interface {v2, p1, p2}, Lg5/d;->a([B[B)[B

    move-result-object p2

    aput-object p2, v0, v1

    invoke-static {v0}, Lu5/f;->a([[B)[B

    move-result-object p2

    iget-object v0, p0, Lm5/c$a;->b:Lr5/b$a;

    iget-object v1, p0, Lm5/c$a;->a:Lg5/u;

    invoke-virtual {v1}, Lg5/u;->e()Lg5/u$c;

    move-result-object v1

    invoke-virtual {v1}, Lg5/u$c;->c()I

    move-result v1

    array-length p1, p1

    int-to-long v2, p1

    invoke-interface {v0, v1, v2, v3}, Lr5/b$a;->b(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    iget-object p2, p0, Lm5/c$a;->b:Lr5/b$a;

    invoke-interface {p2}, Lr5/b$a;->a()V

    throw p1
.end method

.method public b([B[B)[B
    .locals 7

    array-length v0, p1

    const/4 v1, 0x5

    if-le v0, v1, :cond_0

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    array-length v2, p1

    invoke-static {p1, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    iget-object v2, p0, Lm5/c$a;->a:Lg5/u;

    invoke-virtual {v2, v0}, Lg5/u;->f([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg5/u$c;

    :try_start_0
    invoke-virtual {v2}, Lg5/u$c;->f()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg5/d;

    invoke-interface {v3, v1, p2}, Lg5/d;->b([B[B)[B

    move-result-object v3

    iget-object v4, p0, Lm5/c$a;->c:Lr5/b$a;

    invoke-virtual {v2}, Lg5/u$c;->c()I

    move-result v2

    array-length v5, v1

    int-to-long v5, v5

    invoke-interface {v4, v2, v5, v6}, Lr5/b$a;->b(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    :catch_0
    move-exception v2

    invoke-static {}, Lm5/c;->d()Ljava/util/logging/Logger;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ciphertext prefix matches a key, but cannot decrypt: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/logging/Logger;->info(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lm5/c$a;->a:Lg5/u;

    invoke-virtual {v0}, Lg5/u;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg5/u$c;

    :try_start_1
    invoke-virtual {v1}, Lg5/u$c;->f()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg5/d;

    invoke-interface {v2, p1, p2}, Lg5/d;->b([B[B)[B

    move-result-object v2

    iget-object v3, p0, Lm5/c$a;->c:Lr5/b$a;

    invoke-virtual {v1}, Lg5/u$c;->c()I

    move-result v1

    array-length v4, p1

    int-to-long v4, v4

    invoke-interface {v3, v1, v4, v5}, Lr5/b$a;->b(IJ)V
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v2

    :catch_1
    nop

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lm5/c$a;->c:Lr5/b$a;

    invoke-interface {p1}, Lr5/b$a;->a()V

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "decryption failed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
