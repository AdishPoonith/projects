.class public final enum Ls0/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ls0/k;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Ls0/k;

.field public static final enum l:Ls0/k;

.field public static final enum m:Ls0/k;

.field public static final enum n:Ls0/k;

.field private static final synthetic o:[Ls0/k;


# instance fields
.field private final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ls0/k;

    const-string v1, "USER_DATA"

    const/4 v2, 0x0

    const-string v3, "user_data"

    invoke-direct {v0, v1, v2, v3}, Ls0/k;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ls0/k;->k:Ls0/k;

    new-instance v0, Ls0/k;

    const-string v1, "APP_DATA"

    const/4 v2, 0x1

    const-string v3, "app_data"

    invoke-direct {v0, v1, v2, v3}, Ls0/k;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ls0/k;->l:Ls0/k;

    new-instance v0, Ls0/k;

    const-string v1, "CUSTOM_DATA"

    const/4 v2, 0x2

    const-string v3, "custom_data"

    invoke-direct {v0, v1, v2, v3}, Ls0/k;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ls0/k;->m:Ls0/k;

    new-instance v0, Ls0/k;

    const-string v1, "CUSTOM_EVENTS"

    const/4 v2, 0x3

    const-string v3, "custom_events"

    invoke-direct {v0, v1, v2, v3}, Ls0/k;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ls0/k;->n:Ls0/k;

    invoke-static {}, Ls0/k;->b()[Ls0/k;

    move-result-object v0

    sput-object v0, Ls0/k;->o:[Ls0/k;

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

    iput-object p3, p0, Ls0/k;->j:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic b()[Ls0/k;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ls0/k;

    sget-object v1, Ls0/k;->k:Ls0/k;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ls0/k;->l:Ls0/k;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ls0/k;->m:Ls0/k;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ls0/k;->n:Ls0/k;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ls0/k;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Ls0/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls0/k;

    return-object p0
.end method

.method public static values()[Ls0/k;
    .locals 2

    sget-object v0, Ls0/k;->o:[Ls0/k;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls0/k;

    return-object v0
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls0/k;->j:Ljava/lang/String;

    return-object v0
.end method
