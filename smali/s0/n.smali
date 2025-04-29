.class public final enum Ls0/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ls0/n;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Ls0/n;

.field public static final enum l:Ls0/n;

.field public static final enum m:Ls0/n;

.field public static final enum n:Ls0/n;

.field public static final enum o:Ls0/n;

.field private static final synthetic p:[Ls0/n;


# instance fields
.field private final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ls0/n;

    const-string v1, "EVENT"

    const/4 v2, 0x0

    const-string v3, "event"

    invoke-direct {v0, v1, v2, v3}, Ls0/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ls0/n;->k:Ls0/n;

    new-instance v0, Ls0/n;

    const-string v1, "ACTION_SOURCE"

    const/4 v2, 0x1

    const-string v3, "action_source"

    invoke-direct {v0, v1, v2, v3}, Ls0/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ls0/n;->l:Ls0/n;

    new-instance v0, Ls0/n;

    const-string v1, "APP"

    const/4 v2, 0x2

    const-string v3, "app"

    invoke-direct {v0, v1, v2, v3}, Ls0/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ls0/n;->m:Ls0/n;

    new-instance v0, Ls0/n;

    const-string v1, "MOBILE_APP_INSTALL"

    const/4 v2, 0x3

    const-string v3, "MobileAppInstall"

    invoke-direct {v0, v1, v2, v3}, Ls0/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ls0/n;->n:Ls0/n;

    new-instance v0, Ls0/n;

    const-string v1, "INSTALL_EVENT_TIME"

    const/4 v2, 0x4

    const-string v3, "install_timestamp"

    invoke-direct {v0, v1, v2, v3}, Ls0/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ls0/n;->o:Ls0/n;

    invoke-static {}, Ls0/n;->b()[Ls0/n;

    move-result-object v0

    sput-object v0, Ls0/n;->p:[Ls0/n;

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

    iput-object p3, p0, Ls0/n;->j:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic b()[Ls0/n;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ls0/n;

    sget-object v1, Ls0/n;->k:Ls0/n;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ls0/n;->l:Ls0/n;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ls0/n;->m:Ls0/n;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ls0/n;->n:Ls0/n;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ls0/n;->o:Ls0/n;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ls0/n;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Ls0/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls0/n;

    return-object p0
.end method

.method public static values()[Ls0/n;
    .locals 2

    sget-object v0, Ls0/n;->p:[Ls0/n;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls0/n;

    return-object v0
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls0/n;->j:Ljava/lang/String;

    return-object v0
.end method
