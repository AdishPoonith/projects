.class public final Lq/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/Integer;

.field private b:Ljava/lang/Integer;

.field private c:Ljava/lang/Integer;

.field private d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lq/a;
    .locals 5

    new-instance v0, Lq/a;

    iget-object v1, p0, Lq/a$a;->a:Ljava/lang/Integer;

    iget-object v2, p0, Lq/a$a;->b:Ljava/lang/Integer;

    iget-object v3, p0, Lq/a$a;->c:Ljava/lang/Integer;

    iget-object v4, p0, Lq/a$a;->d:Ljava/lang/Integer;

    invoke-direct {v0, v1, v2, v3, v4}, Lq/a;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v0
.end method
