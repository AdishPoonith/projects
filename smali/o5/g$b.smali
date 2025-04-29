.class Lo5/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr5/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo5/g$a;)V
    .locals 0

    invoke-direct {p0}, Lo5/g$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lr5/c;Ljava/lang/String;Ljava/lang/String;)Lr5/b$a;
    .locals 0

    sget-object p1, Lo5/f;->a:Lr5/b$a;

    return-object p1
.end method
