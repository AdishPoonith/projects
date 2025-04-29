.class public final synthetic Lz0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly0/k$a;


# instance fields
.field public final synthetic a:Lz0/f$b;

.field public final synthetic b:Lz0/b;


# direct methods
.method public synthetic constructor <init>(Lz0/f$b;Lz0/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz0/h;->a:Lz0/f$b;

    iput-object p2, p0, Lz0/h;->b:Lz0/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/File;)V
    .locals 2

    iget-object v0, p0, Lz0/h;->a:Lz0/f$b;

    iget-object v1, p0, Lz0/h;->b:Lz0/b;

    invoke-static {v0, v1, p1}, Lz0/f$b$a;->b(Lz0/f$b;Lz0/b;Ljava/io/File;)V

    return-void
.end method
