.class public final Lo5/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo5/n;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lv5/a;

.field private final c:Lcom/google/crypto/tink/shaded/protobuf/i;

.field private final d:Lt5/y$c;

.field private final e:Lt5/i0;

.field private final f:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lt5/y$c;Lt5/i0;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo5/l;->a:Ljava/lang/String;

    invoke-static {p1}, Lo5/q;->d(Ljava/lang/String;)Lv5/a;

    move-result-object p1

    iput-object p1, p0, Lo5/l;->b:Lv5/a;

    iput-object p2, p0, Lo5/l;->c:Lcom/google/crypto/tink/shaded/protobuf/i;

    iput-object p3, p0, Lo5/l;->d:Lt5/y$c;

    iput-object p4, p0, Lo5/l;->e:Lt5/i0;

    iput-object p5, p0, Lo5/l;->f:Ljava/lang/Integer;

    return-void
.end method

.method public static b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lt5/y$c;Lt5/i0;Ljava/lang/Integer;)Lo5/l;
    .locals 7

    sget-object v0, Lt5/i0;->n:Lt5/i0;

    if-ne p3, v0, :cond_1

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Keys with output prefix type raw should not have an id requirement."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    if-eqz p4, :cond_2

    :goto_0
    new-instance v6, Lo5/l;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo5/l;-><init>(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lt5/y$c;Lt5/i0;Ljava/lang/Integer;)V

    return-object v6

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Keys with output prefix type different from raw should have an id requirement."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()Lv5/a;
    .locals 1

    iget-object v0, p0, Lo5/l;->b:Lv5/a;

    return-object v0
.end method

.method public c()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lo5/l;->f:Ljava/lang/Integer;

    return-object v0
.end method

.method public d()Lt5/y$c;
    .locals 1

    iget-object v0, p0, Lo5/l;->d:Lt5/y$c;

    return-object v0
.end method

.method public e()Lt5/i0;
    .locals 1

    iget-object v0, p0, Lo5/l;->e:Lt5/i0;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo5/l;->a:Ljava/lang/String;

    return-object v0
.end method

.method public g()Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 1

    iget-object v0, p0, Lo5/l;->c:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-object v0
.end method
