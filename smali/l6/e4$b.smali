.class Ll6/e4$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll6/e4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field a:Ld6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld6/e<",
            "Lm6/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lm6/l;->i()Ld6/e;

    move-result-object v0

    iput-object v0, p0, Ll6/e4$b;->a:Ld6/e;

    return-void
.end method

.method synthetic constructor <init>(Ll6/e4$a;)V
    .locals 0

    invoke-direct {p0}, Ll6/e4$b;-><init>()V

    return-void
.end method
