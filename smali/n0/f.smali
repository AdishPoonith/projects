.class public final enum Ln0/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln0/f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Ln0/f;

.field public static final enum k:Ln0/f;

.field public static final enum l:Ln0/f;

.field public static final enum m:Ln0/f;

.field private static final synthetic n:[Ln0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/f;

    const-string v1, "deviceDefault"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln0/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/f;->j:Ln0/f;

    new-instance v0, Ln0/f;

    const-string v1, "dictation"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln0/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/f;->k:Ln0/f;

    new-instance v0, Ln0/f;

    const-string v1, "search"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln0/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/f;->l:Ln0/f;

    new-instance v0, Ln0/f;

    const-string v1, "confirmation"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ln0/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/f;->m:Ln0/f;

    invoke-static {}, Ln0/f;->b()[Ln0/f;

    move-result-object v0

    sput-object v0, Ln0/f;->n:[Ln0/f;

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

.method private static final synthetic b()[Ln0/f;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ln0/f;

    sget-object v1, Ln0/f;->j:Ln0/f;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ln0/f;->k:Ln0/f;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ln0/f;->l:Ln0/f;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ln0/f;->m:Ln0/f;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln0/f;
    .locals 1

    const-class v0, Ln0/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln0/f;

    return-object p0
.end method

.method public static values()[Ln0/f;
    .locals 1

    sget-object v0, Ln0/f;->n:[Ln0/f;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln0/f;

    return-object v0
.end method
