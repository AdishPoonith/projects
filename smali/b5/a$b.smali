.class final enum Lb5/a$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb5/a$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Lb5/a$b;

.field public static final enum k:Lb5/a$b;

.field public static final enum l:Lb5/a$b;

.field public static final enum m:Lb5/a$b;

.field private static final synthetic n:[Lb5/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lb5/a$b;

    const-string v1, "READY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb5/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb5/a$b;->j:Lb5/a$b;

    new-instance v0, Lb5/a$b;

    const-string v1, "NOT_READY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lb5/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb5/a$b;->k:Lb5/a$b;

    new-instance v0, Lb5/a$b;

    const-string v1, "DONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lb5/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb5/a$b;->l:Lb5/a$b;

    new-instance v0, Lb5/a$b;

    const-string v1, "FAILED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lb5/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb5/a$b;->m:Lb5/a$b;

    invoke-static {}, Lb5/a$b;->b()[Lb5/a$b;

    move-result-object v0

    sput-object v0, Lb5/a$b;->n:[Lb5/a$b;

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

.method private static synthetic b()[Lb5/a$b;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lb5/a$b;

    sget-object v1, Lb5/a$b;->j:Lb5/a$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lb5/a$b;->k:Lb5/a$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lb5/a$b;->l:Lb5/a$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lb5/a$b;->m:Lb5/a$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lb5/a$b;
    .locals 1

    const-class v0, Lb5/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb5/a$b;

    return-object p0
.end method

.method public static values()[Lb5/a$b;
    .locals 1

    sget-object v0, Lb5/a$b;->n:[Lb5/a$b;

    invoke-virtual {v0}, [Lb5/a$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb5/a$b;

    return-object v0
.end method
