.class final enum Lt9/p0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lt9/p0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Lt9/p0;

.field public static final enum k:Lt9/p0;

.field public static final enum l:Lt9/p0;

.field public static final enum m:Lt9/p0;

.field private static final synthetic n:[Lt9/p0;

.field private static final synthetic o:Lx9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lt9/p0;

    const-string v1, "Ready"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lt9/p0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lt9/p0;->j:Lt9/p0;

    new-instance v0, Lt9/p0;

    const-string v1, "NotReady"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lt9/p0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lt9/p0;->k:Lt9/p0;

    new-instance v0, Lt9/p0;

    const-string v1, "Done"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lt9/p0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lt9/p0;->l:Lt9/p0;

    new-instance v0, Lt9/p0;

    const-string v1, "Failed"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lt9/p0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lt9/p0;->m:Lt9/p0;

    invoke-static {}, Lt9/p0;->b()[Lt9/p0;

    move-result-object v0

    sput-object v0, Lt9/p0;->n:[Lt9/p0;

    invoke-static {v0}, Lx9/b;->a([Ljava/lang/Enum;)Lx9/a;

    move-result-object v0

    sput-object v0, Lt9/p0;->o:Lx9/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic b()[Lt9/p0;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lt9/p0;

    sget-object v1, Lt9/p0;->j:Lt9/p0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lt9/p0;->k:Lt9/p0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lt9/p0;->l:Lt9/p0;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lt9/p0;->m:Lt9/p0;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lt9/p0;
    .locals 1

    const-class v0, Lt9/p0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lt9/p0;

    return-object p0
.end method

.method public static values()[Lt9/p0;
    .locals 1

    sget-object v0, Lt9/p0;->n:[Lt9/p0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt9/p0;

    return-object v0
.end method
