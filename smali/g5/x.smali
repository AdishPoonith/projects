.class public final Lg5/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lg5/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg5/x;

    invoke-direct {v0}, Lg5/x;-><init>()V

    sput-object v0, Lg5/x;->a:Lg5/x;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a()Lg5/x;
    .locals 1

    sget-object v0, Lg5/x;->a:Lg5/x;

    return-object v0
.end method

.method public static b(Lg5/x;)Lg5/x;
    .locals 1

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "SecretKeyAccess is required"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
