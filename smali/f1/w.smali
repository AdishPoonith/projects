.class public final enum Lf1/w;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf1/w;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lf1/w;

.field public static final enum l:Lf1/w;

.field private static final synthetic m:[Lf1/w;


# instance fields
.field private final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lf1/w;

    const-string v1, "ContextChoose"

    const/4 v2, 0x0

    const-string v3, "context_choose"

    invoke-direct {v0, v1, v2, v3}, Lf1/w;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lf1/w;->k:Lf1/w;

    new-instance v0, Lf1/w;

    const-string v1, "JoinTournament"

    const/4 v2, 0x1

    const-string v3, "join_tournament"

    invoke-direct {v0, v1, v2, v3}, Lf1/w;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lf1/w;->l:Lf1/w;

    invoke-static {}, Lf1/w;->b()[Lf1/w;

    move-result-object v0

    sput-object v0, Lf1/w;->m:[Lf1/w;

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

    iput-object p3, p0, Lf1/w;->j:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic b()[Lf1/w;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lf1/w;

    sget-object v1, Lf1/w;->k:Lf1/w;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lf1/w;->l:Lf1/w;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf1/w;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lf1/w;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf1/w;

    return-object p0
.end method

.method public static values()[Lf1/w;
    .locals 2

    sget-object v0, Lf1/w;->m:[Lf1/w;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf1/w;

    return-object v0
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf1/w;->j:Ljava/lang/String;

    return-object v0
.end method
