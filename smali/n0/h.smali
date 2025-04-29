.class public final enum Ln0/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln0/h;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Ln0/h;

.field public static final enum k:Ln0/h;

.field public static final enum l:Ln0/h;

.field public static final enum m:Ln0/h;

.field public static final enum n:Ln0/h;

.field public static final enum o:Ln0/h;

.field public static final enum p:Ln0/h;

.field private static final synthetic q:[Ln0/h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/h;

    const-string v1, "multipleRequests"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln0/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/h;->j:Ln0/h;

    new-instance v0, Ln0/h;

    const-string v1, "unimplemented"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln0/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/h;->k:Ln0/h;

    new-instance v0, Ln0/h;

    const-string v1, "noLanguageIntent"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln0/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/h;->l:Ln0/h;

    new-instance v0, Ln0/h;

    const-string v1, "recognizerNotAvailable"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ln0/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/h;->m:Ln0/h;

    new-instance v0, Ln0/h;

    const-string v1, "missingOrInvalidArg"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ln0/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/h;->n:Ln0/h;

    new-instance v0, Ln0/h;

    const-string v1, "missingContext"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ln0/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/h;->o:Ln0/h;

    new-instance v0, Ln0/h;

    const-string v1, "unknown"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ln0/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/h;->p:Ln0/h;

    invoke-static {}, Ln0/h;->b()[Ln0/h;

    move-result-object v0

    sput-object v0, Ln0/h;->q:[Ln0/h;

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

.method private static final synthetic b()[Ln0/h;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Ln0/h;

    sget-object v1, Ln0/h;->j:Ln0/h;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ln0/h;->k:Ln0/h;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ln0/h;->l:Ln0/h;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ln0/h;->m:Ln0/h;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ln0/h;->n:Ln0/h;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ln0/h;->o:Ln0/h;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Ln0/h;->p:Ln0/h;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln0/h;
    .locals 1

    const-class v0, Ln0/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln0/h;

    return-object p0
.end method

.method public static values()[Ln0/h;
    .locals 1

    sget-object v0, Ln0/h;->q:[Ln0/h;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln0/h;

    return-object v0
.end method
