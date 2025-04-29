.class public final enum Lq0/z;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lq0/z;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Lq0/z;

.field public static final enum k:Lq0/z;

.field public static final enum l:Lq0/z;

.field public static final enum m:Lq0/z;

.field public static final enum n:Lq0/z;

.field public static final enum o:Lq0/z;

.field private static final synthetic p:[Lq0/z;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq0/z;

    const-string v1, "EXPLICIT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lq0/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq0/z;->j:Lq0/z;

    new-instance v0, Lq0/z;

    const-string v1, "TIMER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lq0/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq0/z;->k:Lq0/z;

    new-instance v0, Lq0/z;

    const-string v1, "SESSION_CHANGE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lq0/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq0/z;->l:Lq0/z;

    new-instance v0, Lq0/z;

    const-string v1, "PERSISTED_EVENTS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lq0/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq0/z;->m:Lq0/z;

    new-instance v0, Lq0/z;

    const-string v1, "EVENT_THRESHOLD"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lq0/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq0/z;->n:Lq0/z;

    new-instance v0, Lq0/z;

    const-string v1, "EAGER_FLUSHING_EVENT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lq0/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq0/z;->o:Lq0/z;

    invoke-static {}, Lq0/z;->b()[Lq0/z;

    move-result-object v0

    sput-object v0, Lq0/z;->p:[Lq0/z;

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

.method private static final synthetic b()[Lq0/z;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lq0/z;

    sget-object v1, Lq0/z;->j:Lq0/z;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lq0/z;->k:Lq0/z;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lq0/z;->l:Lq0/z;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lq0/z;->m:Lq0/z;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lq0/z;->n:Lq0/z;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lq0/z;->o:Lq0/z;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lq0/z;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lq0/z;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq0/z;

    return-object p0
.end method

.method public static values()[Lq0/z;
    .locals 2

    sget-object v0, Lq0/z;->p:[Lq0/z;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq0/z;

    return-object v0
.end method
