.class public final enum Ln0/r;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln0/r;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Ln0/r;

.field public static final enum k:Ln0/r;

.field public static final enum l:Ln0/r;

.field public static final enum m:Ln0/r;

.field public static final enum n:Ln0/r;

.field public static final enum o:Ln0/r;

.field private static final synthetic p:[Ln0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/r;

    const-string v1, "listening"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln0/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/r;->j:Ln0/r;

    new-instance v0, Ln0/r;

    const-string v1, "notListening"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln0/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/r;->k:Ln0/r;

    new-instance v0, Ln0/r;

    const-string v1, "unavailable"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln0/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/r;->l:Ln0/r;

    new-instance v0, Ln0/r;

    const-string v1, "available"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ln0/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/r;->m:Ln0/r;

    new-instance v0, Ln0/r;

    const-string v1, "done"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ln0/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/r;->n:Ln0/r;

    new-instance v0, Ln0/r;

    const-string v1, "doneNoResult"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ln0/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/r;->o:Ln0/r;

    invoke-static {}, Ln0/r;->b()[Ln0/r;

    move-result-object v0

    sput-object v0, Ln0/r;->p:[Ln0/r;

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

.method private static final synthetic b()[Ln0/r;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Ln0/r;

    sget-object v1, Ln0/r;->j:Ln0/r;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ln0/r;->k:Ln0/r;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ln0/r;->l:Ln0/r;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ln0/r;->m:Ln0/r;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ln0/r;->n:Ln0/r;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ln0/r;->o:Ln0/r;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln0/r;
    .locals 1

    const-class v0, Ln0/r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln0/r;

    return-object p0
.end method

.method public static values()[Ln0/r;
    .locals 1

    sget-object v0, Ln0/r;->p:[Ln0/r;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln0/r;

    return-object v0
.end method
