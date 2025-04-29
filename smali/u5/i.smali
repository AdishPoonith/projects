.class public final Lu5/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T_WRAPPER::",
        "Lu5/j<",
        "TT_ENGINE;>;T_ENGINE:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final b:Ljava/util/logging/Logger;

.field private static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/security/Provider;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Z

.field public static final e:Lu5/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu5/i<",
            "Lu5/j$a;",
            "Ljavax/crypto/Cipher;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lu5/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu5/i<",
            "Lu5/j$e;",
            "Ljavax/crypto/Mac;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lu5/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu5/i<",
            "Lu5/j$g;",
            "Ljava/security/Signature;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lu5/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu5/i<",
            "Lu5/j$f;",
            "Ljava/security/MessageDigest;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Lu5/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu5/i<",
            "Lu5/j$b;",
            "Ljavax/crypto/KeyAgreement;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Lu5/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu5/i<",
            "Lu5/j$d;",
            "Ljava/security/KeyPairGenerator;",
            ">;"
        }
    .end annotation
.end field

.field public static final k:Lu5/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu5/i<",
            "Lu5/j$c;",
            "Ljava/security/KeyFactory;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lu5/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT_WRAPPER;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-class v0, Lu5/i;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lu5/i;->b:Ljava/util/logging/Logger;

    invoke-static {}, Ll5/b;->c()Z

    move-result v0

    const-string v1, "AndroidOpenSSL"

    const-string v2, "GmsCore_OpenSSL"

    if-eqz v0, :cond_0

    const-string v0, "Conscrypt"

    filled-new-array {v2, v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lu5/i;->b([Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lu5/i;->c:Ljava/util/List;

    const/4 v0, 0x0

    sput-boolean v0, Lu5/i;->d:Z

    goto :goto_1

    :cond_0
    invoke-static {}, Lu5/q;->b()Z

    move-result v0

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lu5/i;->b([Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    sput-object v0, Lu5/i;->c:Ljava/util/List;

    sput-boolean v3, Lu5/i;->d:Z

    :goto_1
    new-instance v0, Lu5/i;

    new-instance v1, Lu5/j$a;

    invoke-direct {v1}, Lu5/j$a;-><init>()V

    invoke-direct {v0, v1}, Lu5/i;-><init>(Lu5/j;)V

    sput-object v0, Lu5/i;->e:Lu5/i;

    new-instance v0, Lu5/i;

    new-instance v1, Lu5/j$e;

    invoke-direct {v1}, Lu5/j$e;-><init>()V

    invoke-direct {v0, v1}, Lu5/i;-><init>(Lu5/j;)V

    sput-object v0, Lu5/i;->f:Lu5/i;

    new-instance v0, Lu5/i;

    new-instance v1, Lu5/j$g;

    invoke-direct {v1}, Lu5/j$g;-><init>()V

    invoke-direct {v0, v1}, Lu5/i;-><init>(Lu5/j;)V

    sput-object v0, Lu5/i;->g:Lu5/i;

    new-instance v0, Lu5/i;

    new-instance v1, Lu5/j$f;

    invoke-direct {v1}, Lu5/j$f;-><init>()V

    invoke-direct {v0, v1}, Lu5/i;-><init>(Lu5/j;)V

    sput-object v0, Lu5/i;->h:Lu5/i;

    new-instance v0, Lu5/i;

    new-instance v1, Lu5/j$b;

    invoke-direct {v1}, Lu5/j$b;-><init>()V

    invoke-direct {v0, v1}, Lu5/i;-><init>(Lu5/j;)V

    sput-object v0, Lu5/i;->i:Lu5/i;

    new-instance v0, Lu5/i;

    new-instance v1, Lu5/j$d;

    invoke-direct {v1}, Lu5/j$d;-><init>()V

    invoke-direct {v0, v1}, Lu5/i;-><init>(Lu5/j;)V

    sput-object v0, Lu5/i;->j:Lu5/i;

    new-instance v0, Lu5/i;

    new-instance v1, Lu5/j$c;

    invoke-direct {v1}, Lu5/j$c;-><init>()V

    invoke-direct {v0, v1}, Lu5/i;-><init>(Lu5/j;)V

    sput-object v0, Lu5/i;->k:Lu5/i;

    return-void
.end method

.method public constructor <init>(Lu5/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT_WRAPPER;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu5/i;->a:Lu5/j;

    return-void
.end method

.method public static varargs b([Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/security/Provider;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p0, v3

    invoke-static {v4}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    sget-object v5, Lu5/i;->b:Ljava/util/logging/Logger;

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v4, v6, v2

    const-string v4, "Provider %s not available"

    invoke-static {v4, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/logging/Logger;->info(Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT_ENGINE;"
        }
    .end annotation

    sget-object v0, Lu5/i;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move-object v2, v1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/Provider;

    :try_start_0
    iget-object v4, p0, Lu5/i;->a:Lu5/j;

    invoke-interface {v4, p1, v3}, Lu5/j;->a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v3

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_1
    sget-boolean v0, Lu5/i;->d:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu5/i;->a:Lu5/j;

    invoke-interface {v0, p1, v1}, Lu5/j;->a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "No good Provider found."

    invoke-direct {p1, v0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method
