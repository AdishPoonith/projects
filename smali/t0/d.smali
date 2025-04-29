.class public final synthetic Lt0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt0/m$b;


# instance fields
.field public final synthetic a:Lf1/r;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lf1/r;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/d;->a:Lf1/r;

    iput-object p2, p0, Lt0/d;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lt0/d;->a:Lf1/r;

    iget-object v1, p0, Lt0/d;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lt0/e;->b(Lf1/r;Ljava/lang/String;)V

    return-void
.end method
