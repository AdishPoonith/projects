.class public final enum Lia/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lia/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Lia/i;

.field public static final enum k:Lia/i;

.field public static final enum l:Lia/i;

.field public static final enum m:Lia/i;

.field private static final synthetic n:[Lia/i;

.field private static final synthetic o:Lx9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lia/i;

    const-string v1, "PUBLIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lia/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lia/i;->j:Lia/i;

    new-instance v0, Lia/i;

    const-string v1, "PROTECTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lia/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lia/i;->k:Lia/i;

    new-instance v0, Lia/i;

    const-string v1, "INTERNAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lia/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lia/i;->l:Lia/i;

    new-instance v0, Lia/i;

    const-string v1, "PRIVATE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lia/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lia/i;->m:Lia/i;

    invoke-static {}, Lia/i;->b()[Lia/i;

    move-result-object v0

    sput-object v0, Lia/i;->n:[Lia/i;

    invoke-static {v0}, Lx9/b;->a([Ljava/lang/Enum;)Lx9/a;

    move-result-object v0

    sput-object v0, Lia/i;->o:Lx9/a;

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

.method private static final synthetic b()[Lia/i;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lia/i;

    sget-object v1, Lia/i;->j:Lia/i;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lia/i;->k:Lia/i;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lia/i;->l:Lia/i;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lia/i;->m:Lia/i;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lia/i;
    .locals 1

    const-class v0, Lia/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lia/i;

    return-object p0
.end method

.method public static values()[Lia/i;
    .locals 1

    sget-object v0, Lia/i;->n:[Lia/i;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lia/i;

    return-object v0
.end method
