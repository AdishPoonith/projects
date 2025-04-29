.class public final enum Landroidx/security/crypto/a$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/security/crypto/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/security/crypto/a$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Landroidx/security/crypto/a$e;

.field private static final synthetic l:[Landroidx/security/crypto/a$e;


# instance fields
.field private final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/security/crypto/a$e;

    const-string v1, "AES256_GCM"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Landroidx/security/crypto/a$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Landroidx/security/crypto/a$e;->k:Landroidx/security/crypto/a$e;

    invoke-static {}, Landroidx/security/crypto/a$e;->b()[Landroidx/security/crypto/a$e;

    move-result-object v0

    sput-object v0, Landroidx/security/crypto/a$e;->l:[Landroidx/security/crypto/a$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Landroidx/security/crypto/a$e;->j:Ljava/lang/String;

    return-void
.end method

.method private static synthetic b()[Landroidx/security/crypto/a$e;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Landroidx/security/crypto/a$e;

    sget-object v1, Landroidx/security/crypto/a$e;->k:Landroidx/security/crypto/a$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/security/crypto/a$e;
    .locals 1

    const-class v0, Landroidx/security/crypto/a$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/security/crypto/a$e;

    return-object p0
.end method

.method public static values()[Landroidx/security/crypto/a$e;
    .locals 1

    sget-object v0, Landroidx/security/crypto/a$e;->l:[Landroidx/security/crypto/a$e;

    invoke-virtual {v0}, [Landroidx/security/crypto/a$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/security/crypto/a$e;

    return-object v0
.end method


# virtual methods
.method g()Lg5/k;
    .locals 1

    iget-object v0, p0, Landroidx/security/crypto/a$e;->j:Ljava/lang/String;

    invoke-static {v0}, Lg5/l;->a(Ljava/lang/String;)Lg5/k;

    move-result-object v0

    return-object v0
.end method
