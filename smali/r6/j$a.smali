.class public final enum Lr6/j$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr6/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lr6/j$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lr6/j$a;

.field public static final enum l:Lr6/j$a;

.field public static final enum m:Lr6/j$a;

.field public static final enum n:Lr6/j$a;

.field private static final synthetic o:[Lr6/j$a;


# instance fields
.field private final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lr6/j$a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lr6/j$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lr6/j$a;->k:Lr6/j$a;

    new-instance v1, Lr6/j$a;

    const-string v3, "SDK"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lr6/j$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lr6/j$a;->l:Lr6/j$a;

    new-instance v3, Lr6/j$a;

    const-string v5, "GLOBAL"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lr6/j$a;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lr6/j$a;->m:Lr6/j$a;

    new-instance v5, Lr6/j$a;

    const-string v7, "COMBINED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lr6/j$a;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lr6/j$a;->n:Lr6/j$a;

    const/4 v7, 0x4

    new-array v7, v7, [Lr6/j$a;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lr6/j$a;->o:[Lr6/j$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lr6/j$a;->j:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lr6/j$a;
    .locals 1

    const-class v0, Lr6/j$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr6/j$a;

    return-object p0
.end method

.method public static values()[Lr6/j$a;
    .locals 1

    sget-object v0, Lr6/j$a;->o:[Lr6/j$a;

    invoke-virtual {v0}, [Lr6/j$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr6/j$a;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lr6/j$a;->j:I

    return v0
.end method
