.class final Lpa/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv9/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lv9/d<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final j:Lpa/b;

.field private static final k:Lv9/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpa/b;

    invoke-direct {v0}, Lpa/b;-><init>()V

    sput-object v0, Lpa/b;->j:Lpa/b;

    sget-object v0, Lv9/h;->j:Lv9/h;

    sput-object v0, Lpa/b;->k:Lv9/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getContext()Lv9/g;
    .locals 1

    sget-object v0, Lpa/b;->k:Lv9/g;

    return-object v0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
